# Release version 0.66

Version 0.66 closes the following issues:

- Too many labels on star field display. Only about 50 labels fit, the field may display hundreds.
  - Implemented an algorythm to select the labels to display based on "importance".
- Ensure when filtering/selecting based on spectral class that it works.
  - Previously poorly formed spectral classes resulted in stars being skipped.
- Implement edit/delete for routes.
  - Add delete route from sidebar.
  - Add "change color" to route edit.
- Fix typeahead in star select fields.
  - Sort star names in combo boxes alphabetically.
  - Replace spaces with underlines in combo box because typing space stops the search.
- Alphabetize route list in sidebar.
- Alphabetize star names in sidebar.
- Activate properties in sidebar when clicking properties in right-click context menu.
- Fix highlight star.
- Fix label location on edit-star form.
- Fix direction of rotation problem.
  - Program was acting as though the mouse was attached to the **back** of the star field so, moving the mouse right rotated the front of the star field to the left.  
    This was very confusing.
  - The program now acts as if the mouse is attached to the **front** of the star.
