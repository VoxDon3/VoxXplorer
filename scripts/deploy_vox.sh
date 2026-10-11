#!/bin/bash
# VoX DoN 3 -- deploy by the proven method (same as the verified build):
#   1. inject the bundle to the console's elfldr on :9021
#   2. watch the page server on :8090 to confirm the install
# waits for the console to come up (default 15 min), then deploys.
set -u
HOST="${PS5_HOST:-192.168.1.53}"
PORT="${PS5_PORT:-9021}"
ELF="/root/workspace/vox-payload-bundle/VoX-DoN-3-Payload-Bundle.elf"
WAIT="${WAIT_SECONDS:-900}"

echo "== preflight"
SIZE=$(stat -c%s "$ELF")
SHA=$(sha256sum "$ELF" | cut -d' ' -f1)
echo "elf   : $ELF"
echo "size  : $SIZE  (verified build: 10764784)"
echo "sha256: $SHA"
[ "$SIZE" = "10764784" ] || { echo "SIZE MISMATCH -- aborting"; exit 1; }

echo "== waiting for $HOST:$PORT (up to ${WAIT}s)"
START=$(date +%s)
while :; do
    if python3 -c "import socket,sys
s=socket.socket(); s.settimeout(3)
sys.exit(0 if s.connect_ex(('$HOST',$PORT))==0 else 1)"; then
        break
    fi
    [ $(( $(date +%s) - START )) -ge "$WAIT" ] && {
        echo "console not reachable after ${WAIT}s -- connect the device and rerun"; exit 2; }
    sleep 5
done
echo "console is up"

echo "== inject"
python3 /tmp/opencode/send_elf.py "$HOST" "$PORT" "$ELF" || exit 3

echo "== verify (watch page server on :8090)"
python3 /tmp/opencode/watch_console.py 300 8090 || exit 4
echo "== DONE: deployed and page server answered"
