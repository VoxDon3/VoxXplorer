.class Lcom/voxdon/xplorer/texteditor/TextEditorEditText$a;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/texteditor/TextEditorEditText;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorEditText;Landroid/view/inputmethod/InputConnection;Z)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorEditText$a;->a:Lcom/voxdon/xplorer/texteditor/TextEditorEditText;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public deleteSurroundingText(II)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_28

    .line 4
    .line 5
    if-nez p2, :cond_28

    .line 6
    .line 7
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorEditText$a;->a:Lcom/voxdon/xplorer/texteditor/TextEditorEditText;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/widget/TextView;->getSelectionStart()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_28

    .line 14
    .line 15
    new-instance p1, Landroid/view/KeyEvent;

    .line 16
    .line 17
    const/16 p2, 0x43

    .line 18
    .line 19
    invoke-direct {p1, v0, p2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_27

    .line 27
    .line 28
    new-instance p1, Landroid/view/KeyEvent;

    .line 29
    .line 30
    invoke-direct {p1, v1, p2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_27

    .line 38
    .line 39
    return v1

    .line 40
    :cond_27
    return v0

    .line 41
    :cond_28
    if-nez p1, :cond_54

    .line 42
    .line 43
    if-ne p2, v1, :cond_54

    .line 44
    .line 45
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorEditText$a;->a:Lcom/voxdon/xplorer/texteditor/TextEditorEditText;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/widget/TextView;->getSelectionStart()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorEditText$a;->a:Lcom/voxdon/xplorer/texteditor/TextEditorEditText;

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/widget/TextView;->length()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-ne v2, v3, :cond_54

    .line 58
    .line 59
    new-instance p1, Landroid/view/KeyEvent;

    .line 60
    .line 61
    const/16 p2, 0x70

    .line 62
    .line 63
    invoke-direct {p1, v0, p2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_53

    .line 71
    .line 72
    new-instance p1, Landroid/view/KeyEvent;

    .line 73
    .line 74
    invoke-direct {p1, v1, p2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_53

    .line 82
    .line 83
    return v1

    .line 84
    :cond_53
    return v0

    .line 85
    :cond_54
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    return p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method
