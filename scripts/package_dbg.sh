#!/bin/bash
# Debug build: adds VoxCrashHook breadcrumbs to catch the startup failure.
set -e
BT=/data/data/com.termux/files/usr/share/android-sdk/build-tools/34.0.0
W=/tmp/opencode
SRC_APK=/root/workspace/cx_explorer.apk
OUT=/root/workspace/VoxXplorer_dbg.apk
KS="${VOX_KEYSTORE:-/root/workspace/Vox_Manager_P.s final/app/release.keystore}"
: "${VOX_STORE_PASSWORD:?set VOX_STORE_PASSWORD}"
: "${VOX_KEY_PASSWORD:?set VOX_KEY_PASSWORD}"

cd "$W"
cp trial.apk "$OUT"

cp dbg_classes.dex classes.dex
cp new_classes2.dex classes2.dex
cp new_classes3.dex classes3.dex
zip -q -X "$OUT" classes.dex classes2.dex classes3.dex

rm -rf orig_extra && mkdir orig_extra
unzip -q -o "$SRC_APK" -x 'res/*' 'classes*.dex' 'resources.arsc' 'AndroidManifest.xml' 'META-INF/*.SF' 'META-INF/*.RSA' 'META-INF/*.DSA' 'META-INF/MANIFEST.MF' -d orig_extra
(cd orig_extra && zip -q -X -X -r "$OUT" .)

cp "$OUT" "$W/vox_dbg_aligned.apk"
"$BT/apksigner" sign \
  --ks "$KS" --ks-key-alias "${VOX_KEY_ALIAS:-vox}" --ks-pass env:VOX_STORE_PASSWORD --key-pass env:VOX_KEY_PASSWORD \
  --min-sdk-version 21 --out "$OUT" "$W/vox_dbg_aligned.apk"
"$BT/apksigner" verify --min-sdk-version 21 "$OUT" && echo "VERIFY OK"
ls -la "$OUT"
"$BT/aapt2" dump badging "$OUT" 2>/dev/null | head -3
cp "$OUT" "/storage/emulated/0/Download/VoxXplorer_dbg.apk"
echo "copied to Download"
