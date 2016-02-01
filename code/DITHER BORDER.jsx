// map
var map = function(value, start1, stop1, start2, stop2){return start2+(value-start1)*(stop2-start2)/(stop1-start1);};


app.doScript (main, ScriptLanguage.JAVASCRIPT, undefined, UndoModes.entireScript, "Add BORDERS");
app.scriptPreferences.enableRedraw = false;

function main(){
	getDialog();
}

function getDialog(){
	var _doc = app.activeDocument;
	var Dialog;

	with(Dialog = app.dialogs.add({name: "Add BORDERS"})){
			with(dialogColumns.add()){
				with(borderPanels.add()){
					with(dialogColumns.add()){
						with(dialogRows.add()){
							staticTexts.add({staticLabel:"Border weight:", minWidth: 50});
							var _strokeWeight  = measurementEditboxes.add({editValue: 10,  editUnits:MeasurementUnits.MILLIMETERS,  minWidth:100});
						}
						with(dialogRows.add()){
							staticTexts.add({staticLabel:"Slug:", minWidth: 50});
							var _slug  = measurementEditboxes.add({editValue: 3,  editUnits:MeasurementUnits.MILLIMETERS,  minWidth:100});
						}
						with(dialogRows.add()){
							staticTexts.add({staticLabel:"From page:", minWidth: 50});
							var pagesList = [];
							for (var i=0; i<_doc.pages.length; i++){
							  pagesList.push((i+1)+"");
							}
							var _from = dropdowns.add({stringList:pagesList, selectedIndex:0, minWidth: 100});
						}
						with(dialogRows.add()){
							staticTexts.add({staticLabel:"To page:", minWidth: 50});
							var pagesList = [];
							for (var i=0; i<_doc.pages.length; i++){
							  pagesList.push((i+1)+"");
							}
							var _to = dropdowns.add({stringList:pagesList, selectedIndex:_doc.pages.length-1, minWidth: 100});
						}
					}
				}
			}
		}
	myResult = Dialog.show();
	if(myResult == true){

		// FOLDER SELECTION
		var folder = Folder.selectDialog("Select a cool folder :");
		if(folder != null){
			if(folder.getFiles().length > parseInt(_to.stringList[_to.selectedIndex]) - parseInt(_from.stringList[_from.selectedIndex])){

				var PATH = folder.absoluteURI;

				// OK GO
				var strokeLayer		= _doc.layers.item("DITHERED_BORDERS");
				var whiteLayer		= _doc.layers.item("DITHERED_BORDERS_WHITE");
				var noColor		    = _doc.swatches.item("None");
				var whiteColor 		= _doc.swatches.item("Paper");

				// add white layer
				if (whiteLayer == null){
					whiteLayer		= _doc.layers.add();
					whiteLayer.move(LocationOptions.atEnd, undefined);
					whiteLayer.name = "DITHERED_BORDERS_WHITE";
				} else {
					// unlock it
					whiteLayer.locked = false;
				}

				// add stroke layer
				if (strokeLayer == null){
					strokeLayer		= _doc.layers.add();
					strokeLayer.move(LocationOptions.atEnd, undefined);
					strokeLayer.name = "DITHERED_BORDERS";
				} else {
					// unlock it
					strokeLayer.locked = false;
				}


				// include it on every page
				for (var i=parseInt(_from.stringList[_from.selectedIndex])-1; i<parseInt(_to.stringList[_to.selectedIndex]); i++){
					var _pg = _doc.pages.item(i);
					var margin = parseFloat(_strokeWeight.editContents);
					var slug = parseFloat(_slug.editContents);

					// WHERE THE MAGIC HAPPENS
					var placeholder	= _pg.rectangles.add();
						placeholder.itemLayer = strokeLayer;
						placeholder.strokeColor = noColor;

					var white = _pg.rectangles.add();
						white.itemLayer = whiteLayer;
						white.strokeColor = noColor;
						white.fillColor = whiteColor;


					if(i%2!=0){ // RIGHT
						placeholder.geometricBounds = [
							-slug,
							-slug,
							_pg.bounds[2] + slug,
							_pg.bounds[1] + slug
						];

						white.geometricBounds = [
							margin,
							0,
							_pg.bounds[2] - margin,
							_pg.bounds[1] - margin
						];
					}else{ // LEFT
						placeholder.geometricBounds = [
							-slug,
							-slug,
							_pg.bounds[2] + slug,
							_pg.bounds[3] + slug
						];

						white.geometricBounds = [
							margin,
							margin,
							_pg.bounds[2] - margin,
							_pg.bounds[3]
						];
					}

					// place image
					var file = new File(PATH + '/'+i+'.png');
					placeholder.place(file, false);
					placeholder.fit(FitOptions.FILL_PROPORTIONALLY);
					placeholder.fit(FitOptions.centerContent);

				}

				// lock the made layers
				strokeLayer.locked = true;
				whiteLayer.locked = true;

				//Remove the dialog from memory.
				Dialog.destroy();

				alert("Complete!");

			}else{
				alert("Not enough files found : at least " + (parseInt(_to.stringList[_to.selectedIndex]) - parseInt(_from.stringList[_from.selectedIndex])) + " files needed.");
				Dialog.destroy();
			}
		}else{
			alert("Error while opening folder.");
			Dialog.destroy();
		}
	}else{
		//Remove the dialog from memory.
		Dialog.destroy();
	}
}

app.scriptPreferences.enableRedraw = true;
