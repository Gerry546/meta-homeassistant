SUMMARY = "Unofficial package to access Bring! shopping lists API."
HOMEPAGE = "https://github.com/miaucl/bring-api"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a904c7a61349b66aabdf1e0870cfa3f4"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "5b83e1a0d0352452c080b23facc5dc1fd580f0957118e9a18bee69f08bbba6aa"

inherit pypi python_setuptools_build_meta ptest-python-pytest

PYPI_PACKAGE = "bring_api"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
RDEPENDS:${PN} = "python3-aiohttp"
