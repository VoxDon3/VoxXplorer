#!/bin/bash
# Build VoxXplorer: compile the re-skinned resources, link with the original stable
# resource IDs, drop in the renamed dex, sign. Resource-only changes ride on top of
# the already-working CX code, so the feature set stays 100% intact.
set -e
RES=/root/workspace/VoxXplorer/app/src/main/res
MAN=/root/workspace/VoxXplorer/app/src/main/AndroidManifest.xml
AAPT=/opt/aapt2-shim/aapt2
JAR=/data/data/com.termux/files/usr/share/android-sdk/platforms/android-34/android.jar
BT=/data/data/com.termux/files/usr/share/android-sdk/build-tools/34.0.0
W=/tmp/opencode

cd "$W"
rm -rf flat && mkdir flat
"$AAPT" compile --dir "$RES" -o "$W/flat"
(cd flat && rm -f ../res_compiled.zip && zip -q -X -X ../res_compiled.zip ./*.flat)

"$AAPT" link \
  -o "$W/trial.apk" \
  -I "$JAR" \
  --manifest "$MAN" \
  -R "$W/res_compiled.zip" \
  --stable-ids "$W/ids2.txt" \
  --auto-add-overlay \
  --java "$W/gen" \
  --min-sdk-version 21 \
  --version-code 278 \
  --version-name 2.7.8

bash /root/workspace/package_vox.sh
cp -f /root/workspace/VoxXplorer.apk /storage/emulated/0/Download/VoxXplorer.apk
echo "copied to /storage/emulated/0/Download/VoxXplorer.apk"
