#What you'll learn

- Add an image to your project
  - Click the + below **Resource Manager**, and select Import Drawables
- Add an ImageView
- Position and size the ImageView
  - set **Constraint Widget** in the Attributes window, margin is 0
  - Below the Constraint Widget in the Constraints section, set the **layout_width and layout_height to 0dp(match constraint)**
- Image scaleType
  - Make background with the image, change the **scaleType** attribute to **centerCrop**

##Good coding practices

- Translating

  - **Hardcoded** strings make it more difficult to translate your app into other languages, and harder to reuse a string in different places in your app.
  - Quick fix to the Hardcoded issues -> Click on the warning -> click on **Fix** button under Suggested Fix

- Content Description for more accessible (users with disabilities)
  - Content description can help make your app more usable with **TalkBack** by defining the purpose of the UI element.
  - Tell TalkBack to skip the ImageView by setting its **importantForAccessibility** attribute to **no**.

##Concept

- ViewGroup
  - It serves as a container for View objects, and is responsible for arranging the View objects within it
  - ConstrainLayout
- Drawable
  - a graphic that can be drawn to the screen
- Dp
  - One dp is a virtual pixel : density-independent pixels (dp) as your unit of measurement.
- Sp
  - scalable pixels: it resizes based on the user's preferred text size.

##Read more

- Accessibility:
  - https://developer.android.com/guide/topics/ui/accessibility
- Support different languages
  - https://developer.android.com/training/basics/supporting-devices/languages
- Dp vs Sp
  - https://developer.android.com/training/multiscreen/screendensities
