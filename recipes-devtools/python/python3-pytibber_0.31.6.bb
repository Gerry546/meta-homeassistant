SUMMARY = "A python3 library to communicate with Tibber"
HOMEPAGE = "https://github.com/Danielhiversen/pyTibber"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "f7e75ab1391ace584f7723e5babaac463c4084132367883f0af60a4b5d7e2984"

inherit pypi python_setuptools_build_meta ptest-python-pytest

SRC_URI:append = " \
    file://run-ptest \
"

RDEPENDS:${PN} = "\
    python3-aiohttp (>=3.0.6) \
    python3-gql (>=3.0.0) \
    python3-websockets (>=10.0) \
"

PTEST_PYTEST_DIR = "test"

PYPI_PACKAGE = "pytibber"
