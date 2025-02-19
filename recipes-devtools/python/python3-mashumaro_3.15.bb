SUMMARY = "Fast serialization library on top of dataclasses"
HOMEPAGE = "https://github.com/Fatal1ty/mashumaro"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7bdee652937974f23d94be386c358bd"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "32a2a38a1e942a07f2cbf9c3061cb2a247714ee53e36a5958548b66bd116d0a9"

inherit pypi python_setuptools_build_meta

PACKAGECONFIG[msgpack] = ",,,python3-msgpack"
PACKAGECONFIG[orjson] = ",,,python3-orjson"
PACKAGECONFIG[toml] = ",,,python3-tomli-w"
PACKAGECONFIG[tomlpython-version-smaller-3-dot-11] = ",,,python3-tomli"
PACKAGECONFIG[yaml] = ",,,python3-pyyaml"

RDEPENDS:${PN} += "\
    python3-typing-extensions (>=4.1.0) \
"

PYPI_PACKAGE = "mashumaro"
