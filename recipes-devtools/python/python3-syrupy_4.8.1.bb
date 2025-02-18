SUMMARY = "Pytest Snapshot Test Utility"
HOMEPAGE = "https://github.com/tophat/syrupy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a74db8ae475d2bd439d60ff9df4e3e3"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "8da8c0311e6d92de0b15767768c6ab98982b7b4a4c67083c08fbac3fbad4d44c"

inherit pypi python_poetry_core

RDEPENDS:${PN} = "python3-pytest"
