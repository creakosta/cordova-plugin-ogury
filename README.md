# cordova-plugin-ogury

**A plugin to enable the Ogury advertisement service on Cordova Android**

* Author: [Phil Lennon](https://frontendphil.com)
* Source: [github.com/fephil/cordova-plugin-ogury](https://github.com/fephil/cordova-plugin-ogury)
* Issues and Suggestions: [github.com/fephil/cordova-plugin-ogury/issues](https://github.com/fephil/cordova-plugin-ogury/issues)
* Twitter: [@frontendphil](https://twitter.com/frontendphil)
* Email: [enquiry@frontendphil.com](mailto:enquiry@frontendphil.com)

***

**IMPORTANT:** This is not an official Ogury plugin. I have built it so Ogury is more suitable for build systems rather than manually editing files. I am not responsible for any problems if you use this plugin. I would accept PR's but won't provide Technical Support in any way. Thanks for understanding.

* Ogury version included: `2.1.14`.
* Target Platform: `Android`.

I have **not** implemented the optional permissions of `GET_ACCOUNTS`, `INSTALL_SHORTCUT` and `UNINSTALL_SHORTCUT` at this time. They are commented out in the `plugin.xml` file.

## Installation

``` cordova plugin add cordova-plugin-ogury --variable API_KEY="[YourApiKey]" ```

## Usage

The Ogury Javascript functions are available to use in the app. Please see the Ogury documentation for more information. Example:

``` CPresage.adToServe(app.onAdEvent, app.onAdNotFound); ```