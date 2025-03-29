SUMMARY = "Library implementing ZHA for Home Assistant"
HOMEPAGE = "https://github.com/zigpy/zha"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

DEPENDS += "\
    python3-setuptools-git-versioning-native \
"

SRC_URI[sha256sum] = "3b5bb51c47c56ef1cbf9022956e32a83dccebe00e91420f614c76a1ac8f36c9e"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-bellows (>=0.44.0) \
    python3-pyserial (>=3.5) \
    python3-pyserial-asyncio-fast \
    python3-zha-quirks (>=0.0.135) \
    python3-zigpy (>=0.78.0) \
    python3-zigpy-deconz (>=0.24.1) \
    python3-zigpy-xbee (>=0.21.0) \
    python3-zigpy-zigate (>-0.13.2) \
    python3-zigpy-znp (>=0.14.0) \
"

PYPI_PACKAGE = "zha"
