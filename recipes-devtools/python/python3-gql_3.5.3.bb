SUMMARY = "GraphQL client for Python"
HOMEPAGE = "https://github.com/graphql-python/gql"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f38bd223275f617b47d97eacc029647f"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "393b8c049d58e0d2f5461b9d738a2b5f904186a40395500b4a84dd092d56e42b"

inherit pypi setuptools3 ptest-python-pytest

RDEPENDS:${PN} += "\
    python3-aiohttp (>=3.9.0b0) \
    python3-anyio (>=3.0) \
    python3-backoff (>=1.11.1) \
    python3-botocore (>=1.21.0) \
    python3-graphql-core (>=3.2) \
    python3-httpx (>=0.23.1) \
    python3-requests (>=2.26) \
    python3-requests-toolbelt (>=1.0.0) \
    python3-websockets (>=10) \
    python3-yarl (>=1.6) \
"

RDEPENDS:${PN}-ptest += "\
    python3-aiofiles \
    python3-mock \
    python3-parse \
    python3-pytest-asyncio \
"

PYPI_PACKAGE = "gql"
