#!/bin/bash
# Sign an existing Vox Xplorer unsigned APK for debugging.
set -e

ROOT=/tmp/opencode/VoxXplorer
UNSIGNED="${1:-/tmp/opencode/vox_rebuild/unsigned.apk}"
OUT="${2:-$ROOT/dist/VoxXplorer-v2.8.2-debug.apk}"
KS="${VOX_KEYSTORE:-/tmp/opencode/vox-release.jks}"
ALIAS="${VOX_KEY_ALIAS:-vox}"
PASS="${VOX_STORE_PASSWORD:-voxxplorer}"

/opt/android-native/bin/apksigner sign \
  --ks "$KS" --ks-key-alias "$ALIAS" \
  --ks-pass pass:"$PASS" --key-pass pass:"$PASS" \
  --min-sdk-version 21 --out "$OUT" "$UNSIGNED"
/opt/android-native/bin/apksigner verify --min-sdk-version 21 "$OUT"
echo "debug build: $OUT"
