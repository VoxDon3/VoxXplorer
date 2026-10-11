.class public final synthetic Lax/c0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Lax/c0/d0$q;


# direct methods
.method public synthetic constructor <init>(Lax/c0/d0$q;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/c0/e0;->a:Lax/c0/d0$q;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c0/e0;->a:Lax/c0/d0$q;

    invoke-interface {v0, p1, p2}, Lax/c0/d0$q;->onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
