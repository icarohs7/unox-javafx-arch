# unox-javafx-arch

[![Kotlin](https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin-logo.svg/240px-Kotlin-logo.svg.png)](
https://kotlinlang.org)

[![Uses badges](https://forthebadge.com/images/badges/uses-badges.svg)](
https://forthebadge.com/)
[![You didn't ask for this](https://forthebadge.com/images/badges/you-didnt-ask-for-this.svg)](
https://forthebadge.com)

[![Jcenter](https://api.bintray.com/packages/icarohs7/libraries/unox-javafx-arch/images/download.svg)](
https://bintray.com/icarohs7/libraries/unox-javafx-arch/_latestVersion)
[![Build Status](https://travis-ci.org/icarohs7/unox-javafx-arch.svg?branch=master)](
https://travis-ci.org/icarohs7/unox-javafx-arch)
[![GitHub top language](https://img.shields.io/github/languages/top/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-javafx-arch/search?l=kotlin)
[![HitCount](http://hits.dwyl.io/icarohs7/unox-javafx-arch.svg)](
http://hits.dwyl.io/icarohs7/unox-javafx-arch)
[![GitHub license](https://img.shields.io/github/license/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-javafx-arch/blob/master/LICENSE)
[![codecov](https://codecov.io/gh/icarohs7/unox-javafx-arch/branch/master/graph/badge.svg)](
https://codecov.io/gh/icarohs7/unox-javafx-arch)

[![GitHub commit activity](https://img.shields.io/github/commit-activity/w/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-javafx-arch/commits/master)
[![GitHub issues](https://img.shields.io/github/issues/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-javafx-arch/issues)
[![GitHub tag](https://img.shields.io/github/tag/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-javafx-arch/releases)
[![GitHub forks](https://img.shields.io/github/forks/icarohs7/unox-javafx-arch.svg?style=social&label=Fork)](
https://github.com/icarohs7/unox-javafx-arch/fork)
[![GitHub stars](https://img.shields.io/github/stars/icarohs7/unox-javafx-arch.svg?style=social&label=Stars)](
https://github.com/icarohs7/unox-javafx-arch)
[![GitHub watchers](https://img.shields.io/github/watchers/icarohs7/unox-javafx-arch.svg?style=social&label=Watch)](
https://github.com/icarohs7/unox-javafx-arch/subscription)

[![GitHub commits](https://img.shields.io/github/commits-since/icarohs7/unox-javafx-arch/v0.1.0.svg)](
https://github.com/icarohs7/unox-javafx-arch/releases/v0.1.0)
[![Awesome Badges](https://img.shields.io/badge/badges-awesome-green.svg)](
https://github.com/Naereen/badges)
[![BADGINATOR](https://badginator.herokuapp.com/icarohs7/unox-javafx-arch.svg)](
https://github.com/defunctzombie/badginator)
[![Open Source Love svg2](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](
https://github.com/ellerbrock/open-source-badges/)
[![GitHub last commit](https://img.shields.io/github/last-commit/icarohs7/unox-javafx-arch.svg)](
https://github.com/icarohs7/unox-core/commits/master)

## Adding to the project

```kotlin
repositories {
    jcenter()
}
dependencies {
    //Artifacts of common module
    implementation("com.github.icarohs7:unoxcore-common:$unoxcore_version") //Multiplatform
    implementation("com.github.icarohs7:unoxcore-common-js:$unoxcore_version") //JS
    implementation("com.github.icarohs7:unoxcore-common-jvm:$unoxcore_version") //JVM
    
    //Common module + JVM specific features
    implementation("com.github.icarohs7:unoxcore-jvm:$unoxcore_version")
}
```