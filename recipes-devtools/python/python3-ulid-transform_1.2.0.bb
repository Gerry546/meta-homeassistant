SUMMARY = "Convert Voluptuous schemas to dictionaries so they can be serialized."
HOMEPAGE = "https://github.com/bdraco/ulid-transform"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8b5b84f8af09011094cd7c29a9f972c"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

inherit python_poetry_core pypi cython

PYPI_PACKAGE = "ulid_transform"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

SRC_URI[sha256sum] = "300d81eabfc0e9a5bfb03bf54e89889b03453e40268d9baa262829eaa6698c9e"
