SUMMARY = "Python interface to Ziggo's Mediabox XL"
HOMEPAGE = "https://github.com/b10m/ziggo_mediabox_xl"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e7ac4be19d3e4f24290b8b2ed1b911f"

SRC_URI = "\
    file://run-ptest \
"

SRC_URI[sha256sum] = "9b34ebfb726dbb8f6f323dc2f88c26d19f2d0990d252dc0555b40590c936e301"

inherit pypi setuptools3 ptest

RDEPENDS:${PN} += "\
    python3-requests (>=2.20.0) \
"

PYPI_PACKAGE = "ziggo_mediabox_xl"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}