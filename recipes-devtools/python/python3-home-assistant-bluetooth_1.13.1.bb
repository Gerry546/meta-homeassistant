SUMMARY = "Basic bluetooth models used by Home Assistant."
HOMEPAGE = "https://github.com/home-assistant-libs/home-assistant-bluetooth"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732518afbb3ba92dbf606e49f9045cc9"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRCREV = "d4fd8a5fcad393c10f6c7472d93e996f0a0c31ba"

inherit pypi python_poetry_core ptest

SRC_URI[sha256sum] = "0ae0e2a8491cc762ee9e694b8bc7665f1e2b4618926f63969a23a2e3a48ce55e"

RDEPENDS:${PN} = "\
    python3-core (>=3.11) \
    python3-habluetooth (>=3.0) \
"

PYPI_PACKAGE = "home_assistant_bluetooth"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
