SUMMARY = "Python server to interact with Matter"
HOMEPAGE = "https://github.com/home-assistant-libs/python-matter-server"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c5a0d917e64171a83d11a738274272f6"

SRC_URI[sha256sum] = "e474cbbd3ceaa76d7d5bc8b89c19c50453abef78ff42a5238a35d8729d1b7c5e"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "python-matter-server"

RDEPENDS:${PN} += "\
	${PYTHON_PN}-aiohttp \
	${PYTHON_PN}-aiorun \
	${PYTHON_PN}-async-timeout \
	${PYTHON_PN}-core (>= 3.10) \
	${PYTHON_PN}-coloredlogs \
	${PYTHON_PN}-dacite \
	${PYTHON_PN}-orjson \
	${PYTHON_PN}-home-assistant-chip-clusters (=2023.10.2) \
"