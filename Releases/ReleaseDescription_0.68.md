# Release version 0.68  18-April-2021

0.68 is a disruptive release that contains more changes than any previous release. 

We have a huge debt to the alpha testers who helped us identify and resolve UI and functional issues in the program including a massive re-design of the program menu.  

## Version 0.68 closes the following issues:

- Rename "Transits" to "Links"
- Change Links UI to bring back CHV's ability to color links based on distance bands. So, for example, 10-7 LY links could be red, 7-5 green, 5-3 blue, etc. to show possible links for different tech abilities
- Provide a way to force a stars label to show, and to save that.
- Re-jigger the heuristics for what stars names to show to overcome the "central tendency" of 0.67
- Add star-names and distances for legs of routes listed in the route tab of the sidebar.
- Remove the X that lets you destroy a tab.  We don't want to do that.
- Remove "LY" from displayed distances in the plot window.  Distances are always in lightyears, it just took space and decreased visibility.
- After a simple query, a program logic error was drawing the plot and then erasing it, forcing us to re-plot, which was annoying.
- Typing in the distance boxes in select stars did not update the slider position. Fixed.
- The program now remembers the last-used dataset instead of forcing you to select a dataset each time you start the program. It also auto-plots that dataset.
- When exporting from the "Select Stars from Dataset" form, the program SAID it was exporting excel, but really made a csv.  Fixed.
- Added a "remove routes" function so you could clear them out and start over.
- Change program behavior after "Add a Dataset" to ask if you want the new one set as the active dataset. 
- Drop the word "dialog" from the window title of the "Add a Dataset Dialog" to just "Add a Dataset"
- Change the label of the control that reverses the rotation on mouse drag from "Change user controls" to "Mouse Drag Rotation Direction" and the label for the checkbox from "Engineer Sense" to "Invert from Default" 
- Save user choice of rotation direction when program closes.
- Fix program version shown in splash screen.
- Replace missing "Republic" in "Terran Interstellar Plotting System" on the splash screen.
- When searching for routes, if the parameters given result in no routes found, return to the search dialog with the entered parameters so the user can modify them without having to re-enter everything. 
- Remember the grid's on-off state when re-centering.  (Previously the grids always turned back on, and the state of the display button was inverted.... ooops.)
- The wording in the startup "reminder" box when you start the program says: "Use "Star Data/Load data set" to choose a dataset." However, the Star Data menu in 0.6.7 does not have a "Load data set" menu item. - wording fixed.
- Data import loading progress said: **Dataset :Polities has 3723 stars are range of 20.000" ** Fixed it to say: **Loaded 3723 stars within 20.0 LY of Sol. into dataset "Polities" **
- Center star's name didn't rotate with all the other star names -- Fixed.
- Added Sol to all the startup "Trips" databases.
- The edit-stars screen is paginated.  The column names let you sort the table based on the columns.  The sorting didn't extend through paginations.  It does now.
- When importing, do not allow a user to select a file to import with the wrong extension.  Extensions must match format chosen for import.
- Objects in view tab, stars were not sorted.  Fixed.
- Once the "astrographic pop up box" has come up and says that it's plotted or selected some number of stars, once a user clicks OK on that, the selection dialog box will now dismiss.
- When importing a dataset file, fill in the dataset name with the file name as a default.
- X-Y-Z orientation was the default for the 3d library.  Now corrected when a dataset is loaded X is left to right across the screen, y is depth, larger numbers deeper into the screen and Z is height larger numbers towards the top of the screen.  Before Y was up down and Z was depth.  Now fixed.
- Removed the "Export entire database" function.  It wasn't useful took forever to run and the file produced was to big to do anything with.  The program still supports exporting data SETS so that you can manipulate them outside trips and re-import, and it supports exporting a selection from a dataset using simple or advanced query.  It's only the "dump everything" option we've removed.
- Highlight star will now enclose the star in an 8 pointed 3d "Moravian" star
- Add keyboard shortcuts
- New Route List Report
- Create a function to click on stars to create a route
- Redesign Menu to standard item order
- Add Aide memory for zoom function
- load new graphical objects into system
- redirect help -> support to the GitHub page for support
- Implement show routes in side pane
- Add Edit star function to Star properties in side panel
- Add a route length label display toggle
- Add a menu option to search for a star and edit it.
- Use shapes to describe polities
- Using color to identify a route and link the side pane to the star-view pane.
- Improve autocompletion of star names
- If we close the manual routing window with the x window decoration, it leaves the plot in Lazy calculation of display scores
- Grid shifts left when side pane opened
- Problem with rotation in 0.6.8 preview
- Advanced search: When results have few stars, grid gets weird.
- Advanced search -- several problems
- Add a general reset of all application preferences
- Star context menu and manual routing
- Error plotting if data set not loaded and spelling in the title bar of the dialog box
- Update buttons in dialog boxes

## Version 0.67 closed the following issues:

- The windows install of 0.66 downloaded bad data to import that either had NO stars or had corrupt data and missing stars. That's fixed. 
- Program now imports all known and valid spectral classes. Note that stars with invalid spectral classes will fail to import. Blank spectral classes are unacceptable. If a spectral class is unknown use "unk" 
- Combo boxes (picklists) now are provided for all the fictional data fields like polity, products, etc when editing stars. 
- When the side-pane is open, the star field now stays centered in the star-field pane.
- Prior to 0.67, when a star had a polity, the decorator around the star kept the star from being selected by clicking on it.  Ooops.  Fixed. 
- In the "Select Stars" dialog, "none" now works. 
- All old CHV datasets will now load.  
- If a star doesn't have a simbad id, grey out the "more info" button.
- When manually creating routes, there is now a cancel button. 

## Version 0.66 closed the following issues:

- Too many labels on star field display. Only about 50 labels fit, the field may display hundreds.
  - Implemented an algorythm to select the labels to display based on "importance".
- Ensure when filtering/selecting based on spectral class that it works.
  - Previously poorly formed spectral classes resulted in stars being skipped.
- Implement edit/delete for routes.
  - Add delete route from sidebar.
  - Add "change color" to route edit.
- Sort star names in combo boxes alphabetically.
- Alphabetize route list in sidebar.
- Alphabetize star names in sidebar.
- Open and update properties tab in the sidebar when clicking properties in right-click context menu.
- Fix label location on edit-star form.
- Fix direction of rotation problem.
  - Program was acting as though the mouse was attached to the **back** of the star field so, moving the mouse right rotated the front of the star field to the left.  
    This was very confusing.
  - The user can now choose the direction of rotation via *Display/Change application preferences/User controls*. Checked acts as if mouse is attached at the back. Uncheckd acts as if mouse is at the front.

**NOTE:** Many of these updates have not been extensivly tested. Please report any issues you have in Slack in the General topic. [Trips Slack site](tripsheadquarters.slack.com)
