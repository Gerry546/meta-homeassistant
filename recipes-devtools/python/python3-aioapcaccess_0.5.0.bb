SUMMARY = "Async version of apcaccess library implemented in python."
HOMEPAGE = "https://github.com/yuxincs/aioapcaccess"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d065570c3f29ddc11696c539cc461035"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI = "git://github.com/yuxincs/aioapcaccess.git;protocol=https;branch=main"
SRCREV = "67b1ae74bbe2511aa7ac2e998fc9b94b659c10af"

inherit python_setuptools_build_meta
