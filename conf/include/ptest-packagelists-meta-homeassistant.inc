#
# Lists of the ptest in meta-homeassistant, sorted into two sets by the time they take
# Please keep these sorted in alphabetical order
#
# A first pass at getting all meta-homeassistant recipes which inherit ptest
# bitbake-layers show-recipes --recipes-only --layer meta-homeassistant --inherits ptest --bare | tr '\n' ' ' | pcregrep -o1 '^NOTE:.+===(.+)$'
#
PTESTS_FAST_META_HOMEASSISTANT = "\
    python3-accuweather \
    python3-adext \
    python3-aioapcaccess \
    python3-aioconsole \
    python3-aiodiscover \
    python3-aioecowitt \
    python3-aioesphomeapi \
    python3-aiohasupervisor \
    python3-aiohttp-asyncmdnsresolver \
    python3-aiorun \
    python3-aioruuvigateway \
    python3-aiousbwatcher \
    python3-airos \
    python3-alarmdecoder \
    python3-amcrest \
    python3-androidtv \
    python3-androidtvremote2 \
    python3-arcam-fmj \
    python3-arris-tg2492lg \
    python3-asusrouter \
    python3-async-upnp-client \
    python3-asyncstdlib \
    python3-audioop-lts \
    python3-aurorapy \
    python3-automower-ble \
    python3-axis \
"

PTESTS_SLOW_META_HOMEASSISTANT = "\
"

PTESTS_NEEDS_ETHERNET_META_HOMEASSISTANT = "\
    python3-aioairq \
    python3-uvloop \
"
