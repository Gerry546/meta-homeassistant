SUMMARY = "Asynchronous Python client for BSBLAN API"
HOMEPAGE = "https://github.com/liudger/python-bsblan"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://.github/LICENSE.md;md5=dcd10fcc0e6a7bf9b19bf4970a991d8a"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "d3b5ae663d7989dfff7f54049fe1d0ba936b6fef1205f4ea345b5c6908abf4c0"

inherit pypi python_hatchling

PYPI_PACKAGE = "python_bsblan"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

RDEPENDS:${PN} += " \
    python3-aiohttp (>=3.8.1) \
    python3-yarl (>=1.7.2) \
    python3-packaging (>=21.3) \
    python3-backoff (>=2.2.1) \
    python3-mashumaro (>=3.13.1) \
    python3-orjson (>=3.9.10) \
"
