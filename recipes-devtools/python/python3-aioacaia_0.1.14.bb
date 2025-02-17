SUMMARY = "Async implementation of pyacaia"
HOMEPAGE = "https://github.com/zweckj/aioacaia"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "914bb0ae4829ecf39d6dd8aa0aa3dec6b80763c7002212b7dda48eab3d144430"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "python3-bleak (>=0.20.2)"

PYPI_PACKAGE = "aioacaia"
