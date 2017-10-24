# cordova-plugin-ogury

**A plugin to enable the Ogury advertisement service on Cordova Android**

* Author: [Phil Lennon](https://frontendphil.com)
* Source: [github.com/fephil/cordova-plugin-ogury](https://github.com/fephil/cordova-plugin-ogury)
* Issues and Suggestions: [github.com/fephil/cordova-plugin-ogury/issues](https://github.com/fephil/cordova-plugin-ogury/issues)
* Twitter: [@frontendphil](https://twitter.com/frontendphil)
* Email: [enquiry@frontendphil.com](mailto:enquiry@frontendphil.com)

***

**IMPORTANT:** I am not responsible for any problems if you use this plugin as I have built this plugin for my specific use case and not yours. I would accept PR's but won't provide Technical Support in any way. Thanks for understanding.

* Ogury version included: `2.1.14`.
* Target Platform: `Android`.

I have **not** implimented the optional permissions of `GET_ACCOUNTS`, `INSTALL_SHORTCUT` and `UNINSTALL_SHORTCUT` at this time. They are commented out in the `plugin.xml` file.

## Installation

``` cordova plugin add https://github.com/fephil/cordova-plugin-ogury.git --variable API_KEY="[YourApiKey]" ```

## Usage

The Ogury Javascript functions are available to use in the app. There are no Typescript definitions available.