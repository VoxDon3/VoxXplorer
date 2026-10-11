.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

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
.end method


# virtual methods
.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView$p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->P()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    if-lez p1, :cond_37

    .line 13
    .line 14
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView$p;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView$p;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->P()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr v1, v0

    .line 31
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$p;->O(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->H(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_37

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 44
    .line 45
    .line 46
    new-instance v1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c$a;

    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$c;Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 v2, 0x64

    .line 52
    .line 53
    invoke-virtual {p1, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    :cond_37
    return v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
