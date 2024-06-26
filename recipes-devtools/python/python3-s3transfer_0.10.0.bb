DESCRIPTION = "An Amazon S3 Transfer Manager"
HOMEPAGE = "https://github.com/boto/s3transfer/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "\
    file://run-ptest \
"
SRC_URI[sha256sum] = "d0c8bbf672d5eebbe4e57945e23b972d963f07d82f661cabf678a5c88831595b"

inherit pypi setuptools3 ptest

RDEPENDS:${PN} += "\
    python3-botocore (>=1.33.2) \
"

RDEPENDS:${PN}-ptest = "\
    python3-pytest \
    python3-unittest-automake-output \
"

do_install_ptest() {
    install -d ${D}${PTEST_PATH}/tests
    cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}
