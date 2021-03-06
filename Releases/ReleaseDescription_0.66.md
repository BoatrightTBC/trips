# Release version 0.66

## Version 0.66 closes the following issues:

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

## Known issues still open

- Typing a space when searching in a combo box ends the search. 

**NOTE:** Many of these updates have not been extensivly tested. Please report any issues you have in Slack in the General topic. [Trips Slack site](tripsheadquarters.slack.com)
