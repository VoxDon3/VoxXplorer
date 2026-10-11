.class public final synthetic Lax/w3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/voxdon/xplorer/viewer/g$g;

.field public final synthetic b:Lax/P0/H;

.field public final synthetic c:Lcom/voxdon/xplorer/viewer/g$f;


# direct methods
.method public synthetic constructor <init>(Lcom/voxdon/xplorer/viewer/g$g;Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w3/k;->a:Lcom/voxdon/xplorer/viewer/g$g;

    iput-object p2, p0, Lax/w3/k;->b:Lax/P0/H;

    iput-object p3, p0, Lax/w3/k;->c:Lcom/voxdon/xplorer/viewer/g$f;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/w3/k;->a:Lcom/voxdon/xplorer/viewer/g$g;

    iget-object v1, p0, Lax/w3/k;->b:Lax/P0/H;

    iget-object v2, p0, Lax/w3/k;->c:Lcom/voxdon/xplorer/viewer/g$f;

    invoke-static {v0, v1, v2, p1}, Lcom/voxdon/xplorer/viewer/g$g;->N(Lcom/voxdon/xplorer/viewer/g$g;Lax/P0/H;Lcom/voxdon/xplorer/viewer/g$f;Landroid/view/View;)V

    return-void
.end method
