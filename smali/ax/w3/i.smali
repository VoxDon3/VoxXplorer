.class public final synthetic Lax/w3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/voxdon/xplorer/viewer/g$b;

.field public final synthetic b:Lax/P0/H;


# direct methods
.method public synthetic constructor <init>(Lcom/voxdon/xplorer/viewer/g$b;Lax/P0/H;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w3/i;->a:Lcom/voxdon/xplorer/viewer/g$b;

    iput-object p2, p0, Lax/w3/i;->b:Lax/P0/H;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/w3/i;->a:Lcom/voxdon/xplorer/viewer/g$b;

    iget-object v1, p0, Lax/w3/i;->b:Lax/P0/H;

    invoke-static {v0, v1, p1}, Lcom/voxdon/xplorer/viewer/g$b;->U(Lcom/voxdon/xplorer/viewer/g$b;Lax/P0/H;Landroid/view/View;)V

    return-void
.end method
