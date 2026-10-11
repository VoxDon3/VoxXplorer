.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

.field final synthetic b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .registers 10

    .line 1
    const/4 p1, 0x6

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eq p2, p1, :cond_7

    .line 4
    .line 5
    const/4 p1, 0x5

    .line 6
    if-ne p2, p1, :cond_3a

    .line 7
    .line 8
    :cond_7
    if-nez p3, :cond_3a

    .line 9
    .line 10
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 23
    .line 24
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iget-object p3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$a;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 35
    .line 36
    iget-object p3, p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x1

    .line 52
    const-string v3, "\n"

    .line 53
    .line 54
    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_3a
    return v0
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
