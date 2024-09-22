SUMMARY = "Python wrapper for TwinCAT ADS library"
HOMEPAGE = "https://github.com/MrLeeh/pyads"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=774af9d8c3ecbeb6a847dfac4c056bb3 \
                    file://adslib/LICENSE;md5=b20289b0f8d3f1fde00abc1e1dba20ab"

SRC_URI[sha256sum] = "23b5f8ba9d1b281585365d044b7ccbe19e6e3236abed45bcca315841246dddc3"

inherit pypi setuptools3

PYPI_PACKAGE = "pyads"

FILES:${PN}-dev += "\
    /usr/adslib/.git* \
    /usr/adslib/.ci* \
    /usr/adslib/* \
"
