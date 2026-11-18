from pathlib import Path
import os
import re
import shutil

ROOT = Path(os.environ.get('VOX_CHANGES_ROOT', '/tmp/opencode/VoxXplorer'))
TEXT_EXT = {'.smali', '.java', '.kt', '.xml', '.gradle', '.sh', '.txt', '.properties',
            '.example', '.pro', '.md', '.json', '.yml', '.yaml'}

# Branded naming only. Technical values (SVG "cx", country code "CX", "sdocx",
# "allocXxx") are intentionally not touched.
REPLS = [
    (r'com\.cxinventor\.file\.explorer', 'com.voxdon.xplorer'),
    (r'com/alphainventor/filemanager', 'com/voxdon/xplorer'),
    (r'com\.alphainventor\.filemanager', 'com.voxdon.xplorer'),
    (r'cxinventor', 'voxdon'),
    (r'alphainventor', 'voxdon'),
    (r'cx_ftp_server_content_background', 'vox_ftp_server_content_background'),
    (r'cx-file-explorer', 'vox-xplorer'),
    (r'cxfileexplorer', 'voxxplorer'),
    (r'cxfileApi21-release', 'voxfileApi21-release'),
    (r'cx\.fileexplorer@gmail\.com', 'vox.xplorer@gmail.com'),
    (r'CxFileExplorer', 'VoxXplorer'),
    (r'com\.cx(?=["\s\)/,;])', 'com.voxdon'),
    (r'Cx file explorer', 'Vox Xplorer'),
    (r'Cx File Explorer', 'Vox Xplorer'),
    (r'CX File Explorer', 'Vox Xplorer'),
    (r'Cx Explorer', 'Vox Xplorer'),
    (r'CX Explorer', 'Vox Xplorer'),
    (r'2\.7\.8', '2.8.2'),
]

changed = []

for path in sorted(ROOT.rglob('*')):
    if not path.is_file():
        continue
    if '.git' in path.parts:
        continue
    if path.name == 'allowed_media_browser_callers.xml':
        # Certificate/base64 blob contains the letters "Cx" by chance.
        continue
    if path.suffix.lower() not in TEXT_EXT:
        continue
    raw = path.read_bytes()
    if b'\0' in raw[:4096]:
        continue
    try:
        text = raw.decode('utf-8')
    except UnicodeDecodeError:
        continue

    orig = text
    for pattern, replacement in REPLS:
        text = re.sub(pattern, replacement, text)

    if path.name == 'strings.xml':
        text = re.sub(r'(<string name="app_name">)[^<]*(</string>)',
                      r'\1Vox Xplorer\2', text)

    if path == ROOT / 'project/resources/AndroidManifest.xml' or path == ROOT / 'AndroidManifest.xml':
        text = re.sub(r'android:versionCode="[^"]*"', 'android:versionCode="101"', text)
        text = re.sub(r'android:versionName="[^"]*"', 'android:versionName="1.0.1"', text)

    if path == ROOT / 'project/app/build.gradle':
        text = re.sub(r'versionCode\s+\d+', 'versionCode 101', text)
        text = re.sub(r'versionName\s+"[^"]*"', 'versionName "1.0.1"', text)

    if text != orig:
        path.write_bytes(text.encode('utf-8'))
        changed.append(str(path.relative_to(ROOT)))

# Rename stale source package directories to the Vox package.
for base in (ROOT / 'project/app/src/main/java', ROOT / 'project/sources'):
    for old, new in (('com/alphainventor/filemanager', 'com/voxdon/xplorer'),
                     ('com/cxinventor/file/explorer', 'com/voxdon/xplorer')):
        src = base / old
        dst = base / new
        if not src.exists():
            continue
        dst.mkdir(parents=True, exist_ok=True)
        for item in list(src.iterdir()):
            target = dst / item.name
            if target.exists():
                if target.is_dir() and item.is_dir():
                    shutil.rmtree(target)
                else:
                    target.unlink()
            shutil.move(str(item), str(target))
        shutil.rmtree(src)
        changed.append(f'{base.relative_to(ROOT)}/{old} -> {new}')

# Rename decoded smali package directories to match the rewritten class names.
for smali_root in sorted(ROOT.glob('smali*')):
    if not smali_root.is_dir():
        continue
    old = smali_root / 'com/alphainventor/filemanager'
    new = smali_root / 'com/voxdon/xplorer'
    if not old.exists():
        continue
    new.mkdir(parents=True, exist_ok=True)
    for item in list(old.iterdir()):
        target = new / item.name
        if target.exists():
            if target.is_dir() and item.is_dir():
                shutil.rmtree(target)
            else:
                target.unlink()
        shutil.move(str(item), str(target))
    shutil.rmtree(old)
    changed.append(f'{smali_root.relative_to(ROOT)}: alphainventor -> voxdon')

# Defensive crash fix: never dereference a null/stale Bookmark.
old_sig = ('.method private v2(Lcom/voxdon/xplorer/bookmark/Bookmark;)V\n'
           '    .registers 6\n')
new_sig = ('.method private v2(Lcom/voxdon/xplorer/bookmark/Bookmark;)V\n'
           '    .registers 6\n\n'
           '    if-eqz p1, :vox_v2_null\n'
           '    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;\n'
           '    move-result-object v0\n'
           '    if-eqz v0, :vox_v2_null\n\n'
           '    :vox_v2_null\n'
           '    return-void\n')
for main in sorted(ROOT.glob('smali*/com/voxdon/xplorer/activity/MainActivity.smali')):
    text = main.read_text()
    if old_sig in text and 'vox_v2_null' not in text:
        main.write_text(text.replace(old_sig, new_sig, 1))
        changed.append(f'{main.relative_to(ROOT)} [null-guard]')

# Show Vox branding text below the logo instead of blanking it.
toolbars = sorted(ROOT.glob('smali*/ax/x3/h.smali'))
text = toolbars[0].read_text() if toolbars else ''

new_brand = '''.method public brand()V
    .registers 3

    iget-object v0, p0, Lax/x3/h;->s:Landroid/view/View;

    if-eqz v0, :vox_brand_logo_done

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :vox_brand_logo_done
    iget-object v0, p0, Lax/x3/h;->f:Landroid/widget/TextView;

    if-eqz v0, :vox_brand_title_done

    const-string v1, "Vox Xplorer"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :vox_brand_title_done
    iget-object v0, p0, Lax/x3/h;->h:Landroid/widget/TextView;

    if-eqz v0, :vox_brand_subtitle_done

    const-string v1, "Vox 2.8.2"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :vox_brand_subtitle_done
    return-void
.end method'''
for toolbar in toolbars:
    text2, n = re.subn(r'\.method public brand\(\)V\n.*?\.end method', new_brand,
                       toolbar.read_text(), count=1, flags=re.S)
    if n:
        toolbar.write_text(text2)
        changed.append(f'{toolbar.relative_to(ROOT)} [brand text]')

print(f'changed entries: {len(changed)}')
for item in changed:
    print(item)
