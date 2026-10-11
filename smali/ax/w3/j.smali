.class public final synthetic Lax/w3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/voxdon/xplorer/viewer/g$e;


# direct methods
.method public synthetic constructor <init>(Lcom/voxdon/xplorer/viewer/g$e;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w3/j;->a:Lcom/voxdon/xplorer/viewer/g$e;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/w3/j;->a:Lcom/voxdon/xplorer/viewer/g$e;

    invoke-static {v0, p1}, Lcom/voxdon/xplorer/viewer/g$e;->U(Lcom/voxdon/xplorer/viewer/g$e;Landroid/view/View;)V

    return-void
.end method
