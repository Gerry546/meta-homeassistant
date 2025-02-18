DESCRIPTION = "A JOSE implementation in Python"
HOMEPAGE = "https://github.com/mpdavis/python-jose/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b2f485d31051eb5916a93212174c041"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
	python3-pytest-runner-native \
"

PYPI_PACKAGE = "python-jose"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

SRC_URI[sha256sum] = "55779b5e6ad599c6336191246e95eb2293a9ddebd555f796a65f838f07e5d78a"

RDEPENDS:${PN} = "\
	python3-pycryptodome \
"
