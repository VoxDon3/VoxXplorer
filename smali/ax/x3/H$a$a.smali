.class Lax/x3/H$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/H$a;-><init>(Lax/x3/H;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/x3/H;

.field final synthetic b:Lax/x3/H$a;


# direct methods
.method constructor <init>(Lax/x3/H$a;Lax/x3/H;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/x3/H$a$a;->b:Lax/x3/H$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/H$a$a;->a:Lax/x3/H;

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
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_1d

    .line 6
    .line 7
    iget-object p1, p0, Lax/x3/H$a$a;->b:Lax/x3/H$a;

    .line 8
    .line 9
    iget-object p1, p1, Lax/x3/H$a;->A:Lax/x3/H;

    .line 10
    .line 11
    invoke-static {p1}, Lax/x3/H;->N(Lax/x3/H;)Lax/x3/F;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1d

    .line 16
    .line 17
    iget-object p1, p0, Lax/x3/H$a$a;->b:Lax/x3/H$a;

    .line 18
    .line 19
    iget-object p1, p1, Lax/x3/H$a;->A:Lax/x3/H;

    .line 20
    .line 21
    invoke-static {p1}, Lax/x3/H;->N(Lax/x3/H;)Lax/x3/F;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lax/x3/H$a$a;->b:Lax/x3/H$a;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Lax/x3/F;->a(Landroidx/recyclerview/widget/RecyclerView$F;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    const/4 p1, 0x0

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
