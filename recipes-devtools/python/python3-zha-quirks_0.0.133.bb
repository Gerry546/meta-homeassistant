SUMMARY = "Library implementing Zigpy quirks for ZHA in Home Assistant"
HOMEPAGE = "https://github.com/zigpy/zha-device-handlers"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=86d3f3a95c324c9479bd8986968f4327"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

DEPENDS += "\
    python3-setuptools-git-versioning-native \
"

SRC_URI += "file://0001-Allow-setuptools-git-versioning-3.patch"
SRC_URI[sha256sum] = "24d5aaf98f1c76ee7f97bf933edfc429f1be683e031151a62d4173323ff0fbcd"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "zha_quirks"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

RDEPENDS:${PN} += "\
    python3-zigpy (>=0.76.0) \
"
