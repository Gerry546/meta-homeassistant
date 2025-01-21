SUMMARY = "Library implementing ZHA for Home Assistant"
HOMEPAGE = "https://github.com/zigpy/zha"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-setuptools-git-versioning-native \
"

SRC_URI[sha256sum] = "6a9fee0cc613e15acc7025f4705825bdcb3db8b3066e8b23c424b37644690113"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-bellows (>=0.42.6) \
    python3-pyserial (>=3.5) \
    python3-pyserial-asyncio-fast \
    python3-zha-quirks (>=0.0.129) \
    python3-zigpy (>=0.73.3) \
    python3-zigpy-deconz (>=0.24.1) \
    python3-zigpy-xbee (>=0.21.0) \
    python3-zigpy-zigate (>-0.13.2) \
    python3-zigpy-znp (>=0.13.1) \
"

PYPI_PACKAGE = "zha"
