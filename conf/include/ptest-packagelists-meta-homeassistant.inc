#
# Lists of the ptest in meta-homeassistant, sorted into two sets by the time they take
# Please keep these sorted in alphabetical order
#
# A first pass at getting all meta-homeassistant recipes which inherit ptest
# bitbake-layers show-recipes --recipes-only --layer meta-homeassistant --inherits ptest --bare | tr '\n' ' ' | pcregrep -o1 '^NOTE:.+===(.+)$''
#
PTESTS_FAST_META_HOMEASSISTANT = "\
    python3-accuweather \
    python3-adb-shell \
    python3-adext \
    python3-aioapcaccess \
    python3-aioconsole \
    python3-aiodiscover \
    python3-aioecowitt \
    python3-aiohttp-asyncmdnsresolver \
    python3-aiorun \
    python3-aioruuvigateway \
    python3-aiousbwatcher \
    python3-airos \
    python3-alarmdecoder \
    python3-amcrest \
    python3-arcam-fmj \
"

PTESTS_SLOW_META_HOMEASSISTANT = "\
"

PTEST_NEEDS_INVESTIGATION_META_HOMEASSISTANT = "\
"

PTESTS_PROBLEMS_MISSES_TEST_FILES_META_HOMEASSISTANT = "\
    python3-aioazuredevops \
    python3-aioesphomeapi \
    python3-aiohasupervisor \
    python3-androidtv \
    python3-async-upnp-client \
"

PTESTS_NEEDS_ETHERNET_META_HOMEASSISTANT = "\
    python3-aioairq \
    python3-uvloop \
"
