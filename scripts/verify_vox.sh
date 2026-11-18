#!/bin/bash
# Verify the rebuilt Vox Xplorer APK naming, version and signature.
set -e
APK="${1:-/tmp/opencode/VoxXplorer/dist/VoxXplorer-v2.8.2-fixed.apk}"
BT=/opt/android-sdk/build-tools/34.0.0

echo "== badging"
/opt/android-native/bin/aapt2 dump badging "$APK" | grep -E '^(package|application-label|sdkVersion|targetSdkVersion)' | head -6

echo "== signature"
/opt/android-native/bin/apksigner verify --print-certs --min-sdk-version 21 "$APK" | grep -E 'DN:|SHA-256' | head -6

echo "== stale naming in resources"
if unzip -p "$APK" resources.arsc | strings | grep -Ei 'cxinventor|alphainventor|cx file explorer|cx_explorer'; then
  echo "STALE NAMING FOUND"
  exit 1
else
  echo "none"
fi
