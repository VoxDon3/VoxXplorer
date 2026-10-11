.class public final synthetic Lax/n/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c0/u$a;


# instance fields
.field public final synthetic a:Lax/n/x;


# direct methods
.method public synthetic constructor <init>(Lax/n/x;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/n/w;->a:Lax/n/x;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/n/w;->a:Lax/n/x;

    invoke-virtual {v0, p1}, Lax/n/x;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
