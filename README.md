# Material 3 Playground
Android Project with Jetpack Compose previews that help you define your own custom color scheme.

### What is included?
- `design.Color.kt` - Source colors for color schemes
- `design.Scheme.kt` - Color schemes with your custom tone valuess
- `design.SchemeDefault.kt` - Color schemes with default to Material 3 tone values
- `design.SchemeSingle.kt` - White monochromatic color schemes injected with respective color
- `design.SchemeWhite.kt` - White monochromatic color schemes
- `design.Theme.kt` - Material theme
- `compose.colors` - Composables displaying color palette previews
- `compose.components` - Composables displaying component previews
- `preview.PreviewComponents.kt` - All previews of components in a single file
- `preview.PreviewColors.kt` - All previews of color palettes in a single file
- `preview.colors` - All previews of components in a single file but displayed with a respective single-color scheme
- `PrintColorSchemes.kt` - Unit test that generates the output Schemes.kt file.

### How to use it?

- Modify colors listed in `design.Color.kt`.
- Adjust scheme colors in `design.Scheme.kt`.
- Focus on a single color role by using one of the previews in `preview.colors`.
- Check out final result using `preview.PreviewComponents.kt`.
- Compare with standard Material 3 color schemes using `preview.PreviewComponentsMaterial.kt`.
- Display whole color pallet using `preview.PreviewColors.kt`.
- Generate `Schemes.kt` file using `PrintColorSchemes.kt`.

### Screenshots

#### Component previews

<p float="left">
    <img src="readme_img/component/BottomAppBars.jpg" alt="" width="200"/>
    <img src="readme_img/component/Buttons.jpg" alt="" width="200"/>
    <img src="readme_img/component/Cards.jpg" alt="" width="200"/>
    <img src="readme_img/component/Checkboxes.jpg" alt="" width="200"/>
    <img src="readme_img/component/Chips.jpg" alt="" width="200"/>
    <img src="readme_img/component/DatePickers.jpg" alt="" width="200"/>
    <img src="readme_img/component/FloatingActionButtons.jpg" alt="" width="200"/>
    <img src="readme_img/component/IconButtons.jpg" alt="" width="200"/>
    <img src="readme_img/component/NavigationBars.jpg" alt="" width="200"/>
    <img src="readme_img/component/ProgressIndicators.jpg" alt="" width="200"/>
    <img src="readme_img/component/SegmentedButtons.jpg" alt="" width="200"/>
    <img src="readme_img/component/Sliders.jpg" alt="" width="200"/>
    <img src="readme_img/component/Snackbars.jpg" alt="" width="200"/>
    <img src="readme_img/component/Switches.jpg" alt="" width="200"/>
    <img src="readme_img/component/TextFields.jpg" alt="" width="200"/>
    <img src="readme_img/component/TimePickers.jpg" alt="" width="200"/>
</p>

#### Color scheme preview
<img src="readme_img/Scheme.jpg" alt="" width="400"/>

#### Color roles previews

###### Primary
<img src="readme_img/color/Primary.jpg" alt="" width="1500"/>

###### Secondary
<img src="readme_img/color/Secondary.jpg" alt="" width="1500"/>

###### Tertiary
<img src="readme_img/color/Tertiary.jpg" alt="" width="1500"/>

###### Neutral
<img src="readme_img/color/Neutral.jpg" alt="" width="1500"/>

###### Error
<img src="readme_img/color/Error.jpg" alt="" width="1500"/>