.class public final synthetic Landroidx/media3/ui/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroidx/media3/ui/d$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/d$b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/e;->a:Landroidx/media3/ui/d$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/e;->a:Landroidx/media3/ui/d$b;

    invoke-static {v0, p1}, Landroidx/media3/ui/d$b;->T(Landroidx/media3/ui/d$b;Landroid/view/View;)V

    return-void
.end method
