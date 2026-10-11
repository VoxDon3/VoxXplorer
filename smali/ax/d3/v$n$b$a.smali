.class Lax/d3/v$n$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/v$n$b;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/bookmark/Bookmark;

.field final synthetic b:Lax/d3/v$n$b;


# direct methods
.method constructor <init>(Lax/d3/v$n$b;Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/v$n$b$a;->b:Lax/d3/v$n$b;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/v$n$b$a;->a:Lcom/voxdon/xplorer/bookmark/Bookmark;

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
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/v$n$b$a;->b:Lax/d3/v$n$b;

    .line 2
    .line 3
    iget-object p1, p1, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 4
    .line 5
    iget-object p1, p1, Lax/d3/v$n;->h:Lax/d3/v;

    .line 6
    .line 7
    invoke-static {p1}, Lax/d3/v;->B5(Lax/d3/v;)Lax/V2/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lax/d3/v$n$b$a;->a:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lax/V2/d;->r(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/d3/v$n$b$a;->b:Lax/d3/v$n$b;

    .line 17
    .line 18
    iget-object p1, p1, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 19
    .line 20
    iget-object p1, p1, Lax/d3/v$n;->h:Lax/d3/v;

    .line 21
    .line 22
    invoke-static {p1}, Lax/d3/v;->B5(Lax/d3/v;)Lax/V2/d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Lax/d3/v$n$b$a;->a:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lax/V2/d;->q(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/d3/v$n$b$a;->b:Lax/d3/v$n$b;

    .line 32
    .line 33
    iget-object p1, p1, Lax/d3/v$n$b;->a:Lax/d3/v$n;

    .line 34
    .line 35
    iget-object p1, p1, Lax/d3/v$n;->g:Lax/x3/j;

    .line 36
    .line 37
    if-eqz p1, :cond_29

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 40
    .line 41
    .line 42
    :cond_29
    const/4 p1, 0x1

    .line 43
    return p1
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
.end method
