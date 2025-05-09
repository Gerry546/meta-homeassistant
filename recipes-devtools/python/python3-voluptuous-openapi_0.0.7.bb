SUMMARY = "Convert voluptuous schemas to OpenAPI Schema object"
HOMEPAGE = "http://github.com/Shulyaka/voluptuous-openapi"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dab31a1d28183826937f4b152143a33f"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "8bce43de12516d5eecfdd5a8198e0d398fcbf45695f02fe0daf8b55d8f666190"

inherit pypi setuptools3 ptest-python-pytest

RDEPENDS:${PN} += "python3-voluptuous"

PYPI_PACKAGE = "voluptuous_openapi"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
