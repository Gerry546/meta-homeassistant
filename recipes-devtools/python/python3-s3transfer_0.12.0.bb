DESCRIPTION = "An Amazon S3 Transfer Manager"
HOMEPAGE = "https://github.com/boto/s3transfer/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "8ac58bc1989a3fdb7c7f3ee0918a66b160d038a147c7b5db1500930a607e9a1c"

inherit pypi setuptools3 ptest-python-pytest

RDEPENDS:${PN} += "\
    python3-botocore (>=1.33.2) \
"
