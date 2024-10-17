SUMMARY = "Library to control Brightech Kuler Sky Bluetooth LED smart lamps"
HOMEPAGE = "https://github.com/emlove/pykulersky"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7edff734bdc28147004eb9f99f721bbd"

SRC_URI[sha256sum] = "ecf1ec6b1fb3053877fd660f51a83945491378467fd089b6882ccb15afa27dc1"

inherit pypi setuptools3 ptest

RDEPENDS:${PN} += "\
    python3-bleak (>=0.10.0) \
    python3-click (>=7.0) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}
