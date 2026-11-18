#!/bin/bash
# Rebuild Vox Xplorer: apktool decode -> aapt2 resources -> smali dexes -> sign.
set -e

ROOT=/tmp/opencode/VoxXplorer
WORK=/tmp/opencode/vox_rebuild
FLAT=/tmp/opencode/vox_flat
DEX=/tmp/opencode/vox_dex
BASE="$ROOT/dist/VoxXplorer-v2.8.2.apk"
OUT="$ROOT/dist/VoxXplorer-v2.8.2-fixed.apk"
KS="${VOX_KEYSTORE:-/tmp/opencode/vox-release.jks}"
ALIAS="${VOX_KEY_ALIAS:-vox}"
PASS="${VOX_STORE_PASSWORD:-voxxplorer}"
AAPT2=/opt/android-native/bin/aapt2
JAR=/opt/android-sdk/platforms/android-36/android.jar
SMALI=/usr/share/java/smali.jar

rm -rf "$WORK" "$FLAT" "$DEX"
mkdir -p "$FLAT" "$DEX"
apktool d -f -o "$WORK" "$BASE"

# Copy only the edited UI files. Copying the whole res tree creates duplicate
# definitions against apktool's decoded values.
mkdir -p "$WORK/res/drawable"
for f in \
  layout/activity_main.xml \
  layout/activity_file_progress.xml \
  layout/desktop2_caruosel_storage.xml \
  layout/fragment_desktop2.xml \
  drawable/vox_glass_card.xml \
  drawable/vox_rounded_button.xml \
  layout/dialog_file_progress.xml \
  layout/view_toolbar_light.xml \
  layout/view_toolbar_dark.xml \
  values/colors.xml \
  values-night/colors.xml \
  values/styles.xml \
  values-fr/strings.xml \
  xml/settings.xml; do
  cp -f "$ROOT/project/app/src/main/res/$f" "$WORK/res/$f"
done
cp -f "$ROOT/project/app/src/main/AndroidManifest.xml" "$WORK/AndroidManifest.xml"

# Apply Vox naming and the crash/branding patches to the decoded tree.
VOX_CHANGES_ROOT="$WORK" python3 "$ROOT/scripts/apply_vox_changes.py" >/dev/null

# Use the edited toolbar smali (sets the neon-blue title colour explicitly).
cp -f "$ROOT/smali/ax/x3/h.smali" "$WORK/smali/ax/x3/h.smali"
# Give the storage carousel enough height for the NETTOYER button below the card.
cp -f "$ROOT/smali/ax/d3/v.smali" "$WORK/smali/ax/d3/v.smali"
# Keep the storage circle's neon colour from the layout (ignore code override).
cp -f "$ROOT/smali/com/voxdon/xplorer/widget/PieProgress.smali" "$WORK/smali/com/voxdon/xplorer/widget/PieProgress.smali"

# Decoded Material dynamic-color aliases point at hidden android colors.
python3 - "$WORK/res/values-v34/colors.xml" <<'PY'
import re, sys
from pathlib import Path
p = Path(sys.argv[1])
if p.exists():
    t = p.read_text()
    t = re.sub(r'<color name="([^"]+)">@android:color/[^<]+</color>',
               lambda m: '<color name="%s">%s</color>' % (
                   m.group(1), '#FFE6F4FB' if '_light_' in m.group(1) else '#FF0A0F14'),
               t)
    p.write_text(t)
PY

$AAPT2 compile --dir "$WORK/res" -o "$FLAT"
(cd "$FLAT" && zip -q -X -X "$WORK/res_compiled.zip" ./*.flat)
$AAPT2 link \
  -o "$WORK/base.apk" -I "$JAR" \
  --manifest "$WORK/AndroidManifest.xml" \
  -R "$WORK/res_compiled.zip" \
  --stable-ids "$ROOT/scripts/ids_full.txt" \
  --auto-add-overlay \
  --min-sdk-version 21 --target-sdk-version 36 \
  --version-code 101 --version-name 1.0.1

for d in smali smali_classes2 smali_classes3; do
  case "$d" in
    smali) out=classes.dex ;;
    smali_classes2) out=classes2.dex ;;
    smali_classes3) out=classes3.dex ;;
  esac
  java -Xmx3g -jar "$SMALI" assemble -a 36 -j 4 -o "$DEX/$out" "$WORK/$d"
done

cp "$WORK/base.apk" "$WORK/unsigned.apk"
(cd "$DEX" && zip -q -X "$WORK/unsigned.apk" classes.dex classes2.dex classes3.dex)
(cd "$WORK" && zip -q -X -r "$WORK/unsigned.apk" assets kotlin META-INF/services)
(cd "$WORK/unknown" && zip -q -X -r "$WORK/unsigned.apk" .)

/opt/android-native/bin/apksigner sign \
  --ks "$KS" --ks-key-alias "$ALIAS" \
  --ks-pass pass:"$PASS" --key-pass pass:"$PASS" \
  --min-sdk-version 21 --out "$OUT" "$WORK/unsigned.apk"
/opt/android-native/bin/apksigner verify --min-sdk-version 21 "$OUT"
$AAPT2 dump badging "$OUT" | head -3
echo "built: $OUT"
