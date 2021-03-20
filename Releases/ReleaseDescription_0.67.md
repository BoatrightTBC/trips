# Release version 0.67  19-March-2021

## Version 0.67 closes the following issues:

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
