.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$t;


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
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->q:Lax/c0/s;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lax/c0/s;->a(Landroid/view/MotionEvent;)Z

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

.method public c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->X(FF)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_16
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$e;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->q:Lax/c0/s;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lax/c0/s;->a(Landroid/view/MotionEvent;)Z

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1
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

.method public e(Z)V
    .registers 2

    .line 1
    return-void
.end method
