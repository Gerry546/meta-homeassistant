# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- LICENSE
# +++ LICENSE
# @@ -199,4 +199,3 @@
#     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#     See the License for the specific language governing permissions and
#     limitations under the License.
# -
# 
#

SUMMARY = "Calculations for the position of the sun and moon"
HOMEPAGE = "https://github.com/sffjunkie/astral"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
RECIPE_MAINTAINER = "Tom Geelen <t.f.g.geelen@gmail.com>"

SRC_URI[sha256sum] = "9b7c3b412e9e69d172cfb24be0e6addcc9f1bd01a28db8bebe66d75ccc533d88"

inherit python_poetry_core pypi

do_configure:prepend() {
    sed -i 's#poetry.masonry.api#poetry.core.masonry.api#g' ${S}/pyproject.toml
    sed -i 's#poetry>=#poetry_core>=#g' ${S}/pyproject.toml
}

RDEPENDS:${PN} = "\
    python3-pytz \
    python3-tzdata \
    python3-zoneinfo \
"
